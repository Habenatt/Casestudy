package perscholas.form;


import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class RegisterFormBean {


@Length(min=1, max=5, message = "First Name must  be between 1 and 5")
    private String firstName;

    @NotEmpty(message = "lastName is required!")
    @Max(value=3, message="LAst Name must have 3 characters minimum!")
    @Min(value=10, message="LAst Name must have 10 characters minimum!")
    private String lastName;

    @Max(value=3, message="Age must be 3  minimum!")
    @Min(value=18, message="Age must be 18  maximum!")
    private String age;




    @NotEmpty(message = "Email is required!")
    private String email;


    private String password;
    private String confirmPassword;


    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

}
