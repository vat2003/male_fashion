package com.asm1.demo01.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Service
public class CookieService {

  @Autowired
  HttpServletRequest request;

  @Autowired
  HttpServletResponse response;

  public Cookie get(String name) {
    Cookie[] cookies = request.getCookies();
    if (cookies != null) {
      for (Cookie cookie : cookies) {
        if (cookie.getName().equals(name)) {
          return cookie;
        }
      }
    }
    return null;
  }

  public String getValue(String name) {
    Cookie cookie = get(name);
    return cookie != null ? cookie.getValue() : null; 
  }

  public Cookie add(String name, String value, int hours) {
     Cookie cookie = new Cookie(name, value);
     cookie.setMaxAge(hours * 60 * 60);
     response.addCookie(cookie);
     return cookie;
  }

  public void remove(String name) {
    Cookie cookie = get(name);
    if (cookie != null) {
      cookie.setMaxAge(0);
      response.addCookie(cookie);
    }
  }

}


