package com.tsel.pet.project.spring.shop.auth.data;

import static java.util.Optional.of;

import com.tsel.pet.project.spring.shop.data.Role;
import com.tsel.pet.project.spring.shop.data.User;
import java.io.Serial;
import java.util.Collection;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class UserDetailsInfo implements UserDetails {

    @Serial
    private static final long serialVersionUID = 8738653371871578644L;

    private String username;
    private String password;
    private Role role;

    public UserDetailsInfo(User user) {
        this.username = user.getUsername();
        this.password = user.getPassword();
        this.role = user.getRole();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return of(role)
            .map(Role::getName)
            .map(SimpleGrantedAuthority::new)
            .stream()
            .toList();
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
