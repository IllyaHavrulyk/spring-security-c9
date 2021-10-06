package com.havrulyk.springsecurityc9.security;

import java.util.UUID;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.security.web.csrf.CsrfTokenRepository;
import org.springframework.security.web.csrf.DefaultCsrfToken;

public class CustomCsrfTokenRepository implements CsrfTokenRepository {

  @Override
  public CsrfToken generateToken(HttpServletRequest httpServletRequest) {
    CsrfToken token = new DefaultCsrfToken("X-CSRF-TOKEN","_csrf", "12345");
    return token;
  }

  @Override
  public void saveToken(CsrfToken csrfToken, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {

  }

  @Override
  public CsrfToken loadToken(HttpServletRequest httpServletRequest) {
    return null;
  }
}
