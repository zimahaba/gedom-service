package com.zimahaba.gedom.entity;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "gedom_user")
public class User extends PersistentEntity {

    @Column(name = "nm_user", length = 16, nullable = false)
    private String username;

    @Column(name = "nm_password", length = 20, nullable = false)
    private String password;

    @Column(name = "email", length = 255, nullable = false)
    private String email;

    @OneToOne(mappedBy = "user",cascade = CascadeType.ALL)
    private Employer employer;

}
