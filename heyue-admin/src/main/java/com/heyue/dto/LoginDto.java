package com.heyue.dto;

import com.heyue.model.Role;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = false)
public class LoginDto {
   public String token ;

   public List<Role> roleList;
}
