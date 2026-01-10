package com.example.demo.Service;

import com.example.demo.Models.Student;
import com.example.demo.Repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MyStudentService implements UserDetailsService {
    private final StudentRepository studentRepository;
    private final PasswordEncoder passwordEncoder;

    public void registr(Student student){
        student.setPassword(passwordEncoder.encode(student.getPassword()));
        student.setRole("ROLE_USER");
        studentRepository.save(student);
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException{
        Student student = studentRepository.findByEmail(email);

        return org.springframework.security.core.userdetails.User
                .withUsername(student.getEmail())
                .password(student.getPassword())
                .roles("USER")
                .build();
    }
}
