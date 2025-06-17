package com.codewithavinash.blog.payloads;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class CategoryDto 
{
   private Integer categoryId;
   @NotBlank
   @Size(min = 4,message = "Size of CategoryTitle is min 4")
   private String categoryTitle;
   @NotBlank
   @Size(min = 10,message = "Size of CategoryDiscription is min 10")
   private String categoryDiscription;
}
