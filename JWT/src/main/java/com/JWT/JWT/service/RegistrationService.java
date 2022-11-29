package com.JWT.JWT.service;

import com.JWT.JWT.domain.ConfirmationToken;
import com.JWT.JWT.domain.User;
import com.JWT.JWT.dto.RegistrationRequest;
import com.JWT.JWT.email.EmailSenderService;
import com.JWT.JWT.repo.UserRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
@AllArgsConstructor
public class RegistrationService {
    private final ConfirmationTokenService confirmationTokenService;
    private final EmailSenderService emailSenderService;
    @Autowired
    PasswordEncoder passwordEncoder;
    @Autowired
    UserRepo userRepo;

    public String register(RegistrationRequest request){

        String token = UUID.randomUUID().toString();
            User user = User.builder()
                    .name(request.getName())
                    .username(request.getUsername())
                    .password(passwordEncoder.encode(request.getPassword()))
                    .build();
             userRepo.save(user);
        String link = "http://localhost:8080/api/v1/registration/confirm?token=" + token;
        emailSenderService.sendSimpleEmail(request.getUsername(),
                "Activate account",
                link);

        System.out.println("it works");
        return token;

        }


    @Transactional
    public String confirmToken(String token) {
        ConfirmationToken confirmationToken = confirmationTokenService
                .getToken(token)
                .orElseThrow(() -> new IllegalStateException("token not found"));

        if (confirmationToken.getConfirmedAt() != null) {
            throw new IllegalStateException("email already confirmed");
        }

        LocalDateTime expiredAt = confirmationToken.getExpiresAt();
        if (expiredAt.isBefore(LocalDateTime.now())) {
            throw new IllegalStateException("token expired");
        }
        return "confirmed";
    }
}
