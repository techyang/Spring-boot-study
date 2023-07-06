package cn.techyang.springboot.controller.vo;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author tecyang@gmail.com
 * @version V1.0
 * @title Hello Word 请求类
 * @description
 * @date 2023-06-10 18:33
 */

@Data
public class HelloRequestVo {
    @NotBlank
    String userName;
    @NotBlank
    String age;
}
