package com.luoxinxin.crowd.entity;

/**
 * Comments:
 * Author：  luoxinxin
 * Create Date：  2020-10-26
 * Modified By： luoxinxin
 */
public class Subject {
    private String subjectName;
    private Integer subjectScore;

    public Subject() {
    }

    public Subject(String subjectName, Integer subjectScore) {
        this.subjectName = subjectName;
        this.subjectScore = subjectScore;
    }
}
