package com.codegym.demo2jwtajax.service.appuser;

import com.codegym.demo2jwtajax.model.AppUser;
import com.codegym.demo2jwtajax.model.DTO.ICountRole;
import com.codegym.demo2jwtajax.service.IGeneralService;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface IAppUserService extends IGeneralService<AppUser>, UserDetailsService {
    AppUser findByName(String name);
    Iterable<ICountRole> getRoleNumber();
}