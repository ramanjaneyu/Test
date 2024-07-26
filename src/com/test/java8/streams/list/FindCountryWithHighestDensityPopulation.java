package com.test.java8.streams.list;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/*
Program to find the Highest Density Population in a Country
 */
public class FindCountryWithHighestDensityPopulation {
    public static void main(String[] args) {
        List<Country> countries = Arrays.asList(
                new Country("a", 100, 100, List.of("ok")),
                new Country("b", 1000, 100, List.of("Awful")),
                new Country("c", 10000, 100, List.of("not bad")),
                new Country("d", 100000, 10, List.of("great"))
        );
        Optional<Country> country = countries.stream().collect(Collectors.maxBy(Comparator.comparing(Country::getPopulation)));
        System.out.println("Print result : " + country.get());
    }
}
class Country {
    public String name;
    public long population;
    public long area;
    public List<String> opinions;

    public Country(String name, long population, long area, List<String> opinions) {
        this.name = name;
        this.population = population;
        this.area = area;
        this.opinions = opinions;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", area=" + area +
                ", opinions=" + opinions +
                '}';
    }
}

