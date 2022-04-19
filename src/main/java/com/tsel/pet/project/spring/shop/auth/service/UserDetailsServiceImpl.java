package com.tsel.pet.project.spring.shop.auth.service;

import com.tsel.pet.project.spring.shop.auth.data.UserDetailsInfo;
import com.tsel.pet.project.spring.shop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private final UserRepository userRepository;

    @Autowired
    public UserDetailsServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findByUsername(username)
            .map(UserDetailsInfo::new)
            .orElseThrow(() -> new UsernameNotFoundException("User not found by username"));
    }
}
