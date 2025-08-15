package com.pl.premier_zone.model;

import jakarta.persistence.*;

@Entity
@Table(name = "players")
public class Player {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String player;
    private String nation;
    private String pos;
    private Integer age;
    private Integer mp;
    private Integer starts;
    @Column(name = "min")
    private Integer minPlayed;
    private Float gls;
    private Float ast;
    private Float pk;
    private Integer crdy;
    private Integer crdr;
    private Float xg;
    private Float xag;
    private String team;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getPlayer() { return player; }
    public void setPlayer(String player) { this.player = player; }
    public String getNation() { return nation; }
    public void setNation(String nation) { this.nation = nation; }
    public String getPos() { return pos; }
    public void setPos(String pos) { this.pos = pos; }
    public Integer getAge() { return age; }
    public void setAge(Integer age) { this.age = age; }
    public Integer getMp() { return mp; }
    public void setMp(Integer mp) { this.mp = mp; }
    public Integer getStarts() { return starts; }
    public void setStarts(Integer starts) { this.starts = starts; }
    public Integer getMinPlayed() { return minPlayed; }
    public void setMinPlayed(Integer minPlayed) { this.minPlayed = minPlayed; }
    public Float getGls() { return gls; }
    public void setGls(Float gls) { this.gls = gls; }
    public Float getAst() { return ast; }
    public void setAst(Float ast) { this.ast = ast; }
    public Float getPk() { return pk; }
    public void setPk(Float pk) { this.pk = pk; }
    public Integer getCrdy() { return crdy; }
    public void setCrdy(Integer crdy) { this.crdy = crdy; }
    public Integer getCrdr() { return crdr; }
    public void setCrdr(Integer crdr) { this.crdr = crdr; }
    public Float getXg() { return xg; }
    public void setXg(Float xg) { this.xg = xg; }
    public Float getXag() { return xag; }
    public void setXag(Float xag) { this.xag = xag; }
    public String getTeam() { return team; }
    public void setTeam(String team) { this.team = team; }
}
