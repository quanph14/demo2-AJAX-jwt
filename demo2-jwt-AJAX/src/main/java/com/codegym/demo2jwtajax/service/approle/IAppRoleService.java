package com.codegym.demo2jwtajax.service.approle;

import com.codegym.demo2jwtajax.model.AppRole;
import com.codegym.demo2jwtajax.service.IGeneralService;

public interface IAppRoleService extends IGeneralService<AppRole> {
    AppRole findByName(String name);
}