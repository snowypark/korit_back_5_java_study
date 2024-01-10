package com.study.ch14;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data // = @Setter @Getter @EqualsAndHashCode @ToString

public class Student {
    private String name;
    private String phone;
    private String address;
    private int age;


}
