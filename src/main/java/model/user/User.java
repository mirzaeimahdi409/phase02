package model.user;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class User extends UserDetails {
    private int id;
    private String name;
    private String email;
    private String password;
    private String country;
    private String location;
    private int gender;
    private int userType;
    private int userStatus;
    private String token;
    private String about;

}
