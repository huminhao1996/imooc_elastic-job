package com.example.springbootelasticjob.model;

import java.math.BigDecimal;
import java.util.Date;

public class Order {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.id
     *
     * @mbg.generated Thu Mar 28 22:27:57 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.amount
     *
     * @mbg.generated Thu Mar 28 22:27:57 CST 2019
     */
    private BigDecimal amount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.status
     *
     * @mbg.generated Thu Mar 28 22:27:57 CST 2019
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.receive_name
     *
     * @mbg.generated Thu Mar 28 22:27:57 CST 2019
     */
    private String receiveName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.receive_address
     *
     * @mbg.generated Thu Mar 28 22:27:57 CST 2019
     */
    private String receiveAddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.receive_mobile
     *
     * @mbg.generated Thu Mar 28 22:27:57 CST 2019
     */
    private String receiveMobile;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.create_user
     *
     * @mbg.generated Thu Mar 28 22:27:57 CST 2019
     */
    private String createUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.create_time
     *
     * @mbg.generated Thu Mar 28 22:27:57 CST 2019
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.update_user
     *
     * @mbg.generated Thu Mar 28 22:27:57 CST 2019
     */
    private String updateUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.update_time
     *
     * @mbg.generated Thu Mar 28 22:27:57 CST 2019
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.id
     *
     * @return the value of t_order.id
     *
     * @mbg.generated Thu Mar 28 22:27:57 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.id
     *
     * @param id the value for t_order.id
     *
     * @mbg.generated Thu Mar 28 22:27:57 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.amount
     *
     * @return the value of t_order.amount
     *
     * @mbg.generated Thu Mar 28 22:27:57 CST 2019
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.amount
     *
     * @param amount the value for t_order.amount
     *
     * @mbg.generated Thu Mar 28 22:27:57 CST 2019
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.status
     *
     * @return the value of t_order.status
     *
     * @mbg.generated Thu Mar 28 22:27:57 CST 2019
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.status
     *
     * @param status the value for t_order.status
     *
     * @mbg.generated Thu Mar 28 22:27:57 CST 2019
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.receive_name
     *
     * @return the value of t_order.receive_name
     *
     * @mbg.generated Thu Mar 28 22:27:57 CST 2019
     */
    public String getReceiveName() {
        return receiveName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.receive_name
     *
     * @param receiveName the value for t_order.receive_name
     *
     * @mbg.generated Thu Mar 28 22:27:57 CST 2019
     */
    public void setReceiveName(String receiveName) {
        this.receiveName = receiveName == null ? null : receiveName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.receive_address
     *
     * @return the value of t_order.receive_address
     *
     * @mbg.generated Thu Mar 28 22:27:57 CST 2019
     */
    public String getReceiveAddress() {
        return receiveAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.receive_address
     *
     * @param receiveAddress the value for t_order.receive_address
     *
     * @mbg.generated Thu Mar 28 22:27:57 CST 2019
     */
    public void setReceiveAddress(String receiveAddress) {
        this.receiveAddress = receiveAddress == null ? null : receiveAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.receive_mobile
     *
     * @return the value of t_order.receive_mobile
     *
     * @mbg.generated Thu Mar 28 22:27:57 CST 2019
     */
    public String getReceiveMobile() {
        return receiveMobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.receive_mobile
     *
     * @param receiveMobile the value for t_order.receive_mobile
     *
     * @mbg.generated Thu Mar 28 22:27:57 CST 2019
     */
    public void setReceiveMobile(String receiveMobile) {
        this.receiveMobile = receiveMobile == null ? null : receiveMobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.create_user
     *
     * @return the value of t_order.create_user
     *
     * @mbg.generated Thu Mar 28 22:27:57 CST 2019
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.create_user
     *
     * @param createUser the value for t_order.create_user
     *
     * @mbg.generated Thu Mar 28 22:27:57 CST 2019
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.create_time
     *
     * @return the value of t_order.create_time
     *
     * @mbg.generated Thu Mar 28 22:27:57 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.create_time
     *
     * @param createTime the value for t_order.create_time
     *
     * @mbg.generated Thu Mar 28 22:27:57 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.update_user
     *
     * @return the value of t_order.update_user
     *
     * @mbg.generated Thu Mar 28 22:27:57 CST 2019
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.update_user
     *
     * @param updateUser the value for t_order.update_user
     *
     * @mbg.generated Thu Mar 28 22:27:57 CST 2019
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.update_time
     *
     * @return the value of t_order.update_time
     *
     * @mbg.generated Thu Mar 28 22:27:57 CST 2019
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.update_time
     *
     * @param updateTime the value for t_order.update_time
     *
     * @mbg.generated Thu Mar 28 22:27:57 CST 2019
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}