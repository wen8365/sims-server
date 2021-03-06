package com.agilework.sims.dto;

import com.agilework.sims.domain.StudentBase;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StudentInfo extends StudentBase {
    private int order;
    private String password;

    public String getStudentNo() {
        return studentNo;
    }

    @Override
    public String toString() {
        // override toString() generated by @Data, or it will print the password
        return "StudentInfo(studentNo=" + studentNo + ", " +
                "studentName=" + studentName+ ", " +
                "sex=" + sex + ", " +
                "major=" + major + ", " +
                "grade=" + grade + ", " +
                "class=" + clazz + ")";
    }
}
