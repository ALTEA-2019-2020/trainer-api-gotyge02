package com.miage.altea.trainer_api.bo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Trainer {
    @Id
    private String name;

    @Column
    private String password;

    @ElementCollection
    private List<Pokemon> team;

    public Trainer() {}

    public Trainer(String name) {
        this.name=name;
    }

    public Trainer(String name, List<Pokemon> team) {
        this.name=name;
        this.team=team;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Pokemon> getTeam() {
        return team;
    }

    public void setTeam(List<Pokemon> team) {
        this.team = team;
    }
}
