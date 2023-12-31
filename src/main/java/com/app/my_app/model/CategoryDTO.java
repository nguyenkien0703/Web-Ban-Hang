package com.app.my_app.model;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CategoryDTO {

    private Long id;

    @Size(max = 255)
    private String name;

    @Size(max = 255)
    private String description;

    private Long categoryParent;

}
