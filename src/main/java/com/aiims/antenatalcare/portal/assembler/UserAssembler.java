package com.aiims.antenatalcare.portal.assembler;

import org.springframework.stereotype.Component;

import com.aiims.antenatalcare.portal.dto.UserDto;
import com.aiims.antenatalcare.portal.entity.Admin;

@Component
public class UserAssembler implements BaseAssembler<Admin, UserDto>{

	@Override
	public UserDto toDto(Admin e) {
		UserDto user = new UserDto();
		user.setAdminid(e.getAdminId());
		user.setEmail(e.getEmail());
		user.setName(e.getName());
		user.setUsername(e.getUsername());
		return user;
	}

	@Override
	public Admin toEntity(UserDto d) {
		Admin admin = new Admin();
		if(null != d.getAdminid() && d.getAdminid()>0) {
			admin.setAdminid(d.getAdminid());
		}
		admin.setEmail(d.getEmail());
		admin.setUsername(d.getUsername());
		admin.setName(d.getName());
		
		return admin;
	}


}
