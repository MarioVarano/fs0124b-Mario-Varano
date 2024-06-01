package it.epicode.Ultimo.services.security;

import java.util.Collection;
import java.util.List;

import it.epicode.Ultimo.entities.Utente;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

// Utente per la gestione utenti in Spring Security
@Data
@AllArgsConstructor
@Builder(setterPrefix = "with")
public class SecurityUserDetails implements UserDetails {
	private static final long serialVersionUID = 1L;

	// l'elenco dei ruoli dell'utente
	private Collection<? extends GrantedAuthority> authorities;
	private String password;
	private String nome;
	@Builder.Default
	private boolean accountNonExpired = true;
	@Builder.Default
	private boolean accountNonLocked = true;
	@Builder.Default
	private boolean credentialsNonExpired = true;
	@Builder.Default
	private boolean enabled = true;

	public static SecurityUserDetails build(Utente utente) {
			SimpleGrantedAuthority authority = new SimpleGrantedAuthority(utente.getRuolo().getNome());
			return SecurityUserDetails.builder()
					.withNome(utente.getNome())
					.withPassword(utente.getPassword())
					.withAuthorities(List.of(authority)) // Creiamo una lista con un solo elemento
					.build();

	}

	@Override
	public String getUsername() {
		return "";
	}
}
