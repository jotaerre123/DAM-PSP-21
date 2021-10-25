package com.salesianostriana.dam._E07.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;
import java.util.Date;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddedToPK {

    private Long song_id;

    private Long playlist_id;

    private Date datetime;

    private int order;

}
