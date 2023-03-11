package com.heyue.heyue.pojo.staff;

/***
 * 员工信息
 */
public class staffVO {
    /**
     * 主键
     */
    private Integer id;
    /**
     *用户名
     */
    private String  userCode;
    /**
     *用户姓名
     */
    private String userName;
    /**
     *性别
     */
    private Integer sex;
    /**
     *手机号码
     */
    private String telephone;
    /**
     *角色
     */
    private Integer roleId;
    /**
     *状态
     */
    private String status;
    /**
     *删除标记
     */
    private Integer dr;

    public staffVO() {
    }

    public staffVO(Integer id, String userCode, String userName, Integer sex, String telephone, Integer roleId, String status) {
        this.id = id;
        this.userCode = userCode;
        this.userName = userName;
        this.sex = sex;
        this.telephone = telephone;
        this.roleId = roleId;
        this.status = status;
        this.dr = Integer.valueOf(0);
    }

}
