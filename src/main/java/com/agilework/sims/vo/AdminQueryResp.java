package com.agilework.sims.vo;

import com.agilework.sims.dto.AdminInfo;
import com.agilework.sims.util.ErrorCode;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdminQueryResp extends BaseResp {
    private AdminInfo adminInfo;

    public AdminQueryResp () {
        super();
    }

    public AdminQueryResp(ErrorCode code) {
        super(code);
    }
}
