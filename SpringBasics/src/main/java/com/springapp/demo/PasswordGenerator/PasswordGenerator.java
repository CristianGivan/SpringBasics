package com.springapp.demo.PasswordGenerator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class PasswordGenerator {
    private PasswordAlphabet passwordAlphabet;
    private PasswordEncoder passwordEncoder;
    private static final Random random = new Random();

    public PasswordGenerator(@Qualifier("allCharacters") PasswordAlphabet passwordAlphabet,@Autowired PasswordEncoder passwordEncoder) {
        this.passwordAlphabet = passwordAlphabet;
        this.passwordEncoder=passwordEncoder;
    }

    public String generatePassword(int length) {
        StringBuffer password = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int characterAt = random.nextInt(passwordAlphabet.getCharacters().length());
            password.append(passwordAlphabet.getCharacters().charAt(characterAt));
        }

        return password.toString();
    }
    public String encodePassword(String password){
        return passwordEncoder.encode(password);
    }
}
