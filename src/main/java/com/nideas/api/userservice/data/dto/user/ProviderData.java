package com.nideas.api.userservice.data.dto.user;

import java.util.List;
import lombok.Data;

/** Created by Nanugonda on 6/26/2018. */
@Data
public class ProviderData extends User {

  private String organization;
  private String description;
  private List<String> facilities;
  // Getters and Setters are generated by the class level annotation lombok.Data
}
