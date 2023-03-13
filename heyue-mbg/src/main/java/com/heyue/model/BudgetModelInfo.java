package com.heyue.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class BudgetModelInfo implements Serializable {
    private Long id;

    private Long budgetModelId;

    @ApiModelProperty(value = "空间")
    private Long spaceId;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBudgetModelId() {
        return budgetModelId;
    }

    public void setBudgetModelId(Long budgetModelId) {
        this.budgetModelId = budgetModelId;
    }

    public Long getSpaceId() {
        return spaceId;
    }

    public void setSpaceId(Long spaceId) {
        this.spaceId = spaceId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", budgetModelId=").append(budgetModelId);
        sb.append(", spaceId=").append(spaceId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}