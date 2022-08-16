package model.user;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class UserDetails {
    private int lng;
    private int lat;
    private String dob;
    private String profilePicture;
    private String coverPicture;
    private String liveLocation;
}
