package br.com.opet.tds.pokeapiapp.Model;


import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Diego on 12/08/2018.
 */

public class Pokemon {

    @SerializedName("id")
    private long ID;
    private String name;
    private int height;
    private int weight;
    private List<Types> types;
    private Sprites sprites;

    public Pokemon() {
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public List<Types> getTypes() {
        return types;
    }

    public void setTypes(List<Types> types) {
        this.types = types;
    }

    public Sprites getSprites() { return sprites; }

    public void setSprites(Sprites sprites) { this.sprites = sprites; }

    public class Types{
        private Type type;

        public Types() {
        }

        public Type getType() {
            return type;
        }

        public void setType(Type type) {
            this.type = type;
        }

        public class Type{
            private String name;

            public Type() {
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
    }

    public class Sprites {
        @SerializedName("front_default")
        private String frontDefault;

        public Sprites() {}

        public String getFrontDefault() { return frontDefault; }

        public void setFrontDefault(String frontDefault) { this.frontDefault = frontDefault; }
    }
}
