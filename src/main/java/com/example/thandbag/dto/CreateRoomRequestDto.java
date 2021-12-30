package com.example.thandbag.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class CreateRoomRequestDto {
    private Long pub_id;
    private Long sub_id;
}
