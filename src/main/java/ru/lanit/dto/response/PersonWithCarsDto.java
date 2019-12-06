package ru.lanit.dto.response;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import ru.lanit.dto.request.CarDto;
import ru.lanit.serializer.RuJsonDateSerializer;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

public class PersonWithCarsDto {
    @NotNull
    private Long id;

    @NotNull
    private String name;

    @JsonSerialize(using = RuJsonDateSerializer.class)
    private LocalDate birthdate;

    private List<CarDto> carList;

    public PersonWithCarsDto() {
    }

    public PersonWithCarsDto(Long id, String name, LocalDate birthdate, List<CarDto> carList) {
        this.id = id;
        this.name = name;
        this.birthdate = birthdate;
        this.carList = carList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public List<CarDto> getCarList() {
        return carList;
    }

    public void setCarList(List<CarDto> carList) {
        this.carList = carList;
    }
}
