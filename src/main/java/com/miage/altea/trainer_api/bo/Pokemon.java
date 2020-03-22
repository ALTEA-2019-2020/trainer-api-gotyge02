package com.miage.altea.trainer_api.bo;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Embeddable;

@Embeddable
@Builder
@Data
public class Pokemon {
    private int pokemonTypeId;

    private int level;

    public Pokemon() {

    }

    public Pokemon(int pokemonTypeId, int level) {
        this.pokemonTypeId=pokemonTypeId;
        this.level=level;
    }

    public int getPokemonTypeId() {
        return pokemonTypeId;
    }

    public void setPokemonTypeId(int pokemonTypeId) {
        this.pokemonTypeId = pokemonTypeId;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
