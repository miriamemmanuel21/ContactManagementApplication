package africa.semicolon.DTOs.Request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class userRegisterRequest {
    private String FirstName;
    private String LastName;
    private String Email;
    private String PassWord;

}
