package com.msworld.userService.VO;

import com.msworld.userService.entity.UserDetail;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {

    private UserDetail user;
    private Department department;
}