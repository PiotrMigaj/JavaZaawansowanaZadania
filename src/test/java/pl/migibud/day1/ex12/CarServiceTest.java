package pl.migibud.day1.ex12;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.migibud.day1.ex12.sortinglistofcars.FilterParameter;


import java.util.ArrayList;
import java.util.List;

//import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
//import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

class CarServiceTest {

    private CarService carService;

    @BeforeEach
    void setUp(){
        carService = new CarService();
    }

    @Test
    void shouldAddCarToCarService(){
        //given
        Manufacturer manufacturer = Manufacturer
                .builder()
                .name("Automaxi")
                .yearOfEstablishment(1992)
                .country("PL")
                .build();

        Car car = Car.builder()
                .name("Seat")
                .price(32_000)
                .yearOfProduction(2007)
                .manufacturerList(List.of(manufacturer))
                .engine(Engine.V6)
                .build();

        //when
        carService.addCar(car);
        //then
        assertThat(carService.getCarList().size()).isEqualTo(1);
        assertThat(carService.getCarList().get(0)).isEqualTo(car);
    }

    @Test
    void shouldRemoveCarFromCarService(){
        //given
        Manufacturer manufacturer = Manufacturer
                .builder()
                .name("Automaxi")
                .yearOfEstablishment(1992)
                .country("PL")
                .build();

        Car car = Car.builder()
                .name("Seat")
                .price(32_000)
                .yearOfProduction(2007)
                .manufacturerList(List.of(manufacturer))
                .engine(Engine.V6)
                .build();

        carService.addCar(car);
        //when
        //then
        assertThat(carService.removeCarFromCarService(car)).isTrue();
        assertThat(carService.getCarList().size()).isEqualTo(0);
        assertThat(carService.removeCarFromCarService(car)).isFalse();
    }

    @Test
    void shouldReturnListOfAllCarsInCarService(){
        //given
        Manufacturer manufacturer = Manufacturer
                .builder()
                .name("Automaxi")
                .yearOfEstablishment(1992)
                .country("PL")
                .build();

        Car car = Car.builder()
                .name("Seat")
                .price(32_000)
                .yearOfProduction(2007)
                .manufacturerList(List.of(manufacturer))
                .engine(Engine.V6)
                .build();
        List<Car> expectedResult = List.of(car);
        carService.addCar(car);
        //when
        //then
        assertThat(carService.getCarList()).isEqualTo(expectedResult);

    }

    @Test
    void shouldReturnListOfAllCarsWithEngineV12(){
        //given
        Manufacturer manufacturer = Manufacturer
                .builder()
                .name("Automaxi")
                .yearOfEstablishment(1992)
                .country("PL")
                .build();

        Car car1 = Car.builder()
                .name("Seat")
                .price(32_000)
                .yearOfProduction(1998)
                .manufacturerList(List.of(manufacturer))
                .engine(Engine.V6)
                .build();

        Car car2 = Car.builder()
                .name("VW")
                .price(62_000)
                .yearOfProduction(2017)
                .manufacturerList(List.of(manufacturer))
                .engine(Engine.V12)
                .build();

        List<Car> expectedResult = List.of(car2);
        carService.addCar(car1);
        carService.addCar(car2);
        //when
        //then
        assertThat(carService.getAllCarsWithEngineV12()).isEqualTo(expectedResult);
        assertThat(carService.getAllCarsWithEngineV12().size()).isEqualTo(1);

    }

    @Test
    void shouldReturnListOfAllCarsProducedBefore1999(){
        //given
        Manufacturer manufacturer = Manufacturer
                .builder()
                .name("Automaxi")
                .yearOfEstablishment(1992)
                .country("PL")
                .build();

        Car car1 = Car.builder()
                .name("Seat")
                .price(32_000)
                .yearOfProduction(1998)
                .manufacturerList(List.of(manufacturer))
                .engine(Engine.V6)
                .build();

        Car car2 = Car.builder()
                .name("VW")
                .price(62_000)
                .yearOfProduction(2017)
                .manufacturerList(List.of(manufacturer))
                .engine(Engine.V12)
                .build();

        List<Car> expectedResult = List.of(car1);
        carService.addCar(car1);
        carService.addCar(car2);
        //when
        //then
        assertThat(carService.getAllCarsProducedBefore1999()).isEqualTo(expectedResult);
        assertThat(carService.getAllCarsWithEngineV12().size()).isEqualTo(1);

    }

    @Test
    void shouldReturnMostExpensiveCar(){
        //given
        Manufacturer manufacturer = Manufacturer
                .builder()
                .name("Automaxi")
                .yearOfEstablishment(1992)
                .country("PL")
                .build();

        Car car1 = Car.builder()
                .name("Seat")
                .price(32_000)
                .yearOfProduction(1998)
                .manufacturerList(List.of(manufacturer))
                .engine(Engine.V6)
                .build();

        Car car2 = Car.builder()
                .name("VW")
                .price(62_000)
                .yearOfProduction(2017)
                .manufacturerList(List.of(manufacturer))
                .engine(Engine.V12)
                .build();

        Car expectedResult = car2;
        carService.addCar(car1);
        carService.addCar(car2);
        //when
        //then
        assertThat(carService.getTheMostExpensiveCar()).isEqualTo(expectedResult);
    }

    @Test
    void shouldThrowExceptionWhenReturningMostExpensiveCarIfThereIsNoCars(){
        //given
        //when
        //then
        assertThatThrownBy(()->carService.getTheMostExpensiveCar())
                .isInstanceOf(RuntimeException.class);
    }

    @Test
    void shouldReturnTheCheapestCar(){
        //given
        Manufacturer manufacturer = Manufacturer
                .builder()
                .name("Automaxi")
                .yearOfEstablishment(1992)
                .country("PL")
                .build();

        Car car1 = Car.builder()
                .name("Seat")
                .price(32_000)
                .yearOfProduction(1998)
                .manufacturerList(List.of(manufacturer))
                .engine(Engine.V6)
                .build();

        Car car2 = Car.builder()
                .name("VW")
                .price(62_000)
                .yearOfProduction(2017)
                .manufacturerList(List.of(manufacturer))
                .engine(Engine.V12)
                .build();

        Car expectedResult = car1;
        carService.addCar(car1);
        carService.addCar(car2);
        //when
        //then
        assertThat(carService.getTheCheapestCar()).isEqualTo(expectedResult);
    }

    @Test
    void shouldThrowExceptionWhenReturningTheCheapestCarIfThereIsNoCars(){
        //given
        //when
        //then
        assertThatThrownBy(()->carService.getTheCheapestCar()   )
                .isInstanceOf(RuntimeException.class);
    }

    @Test
    void shouldReturnTheListOfCarsWithAtLeast3Manufacturers(){
        //given
        Manufacturer manufacturer1 = Manufacturer
                .builder()
                .name("Automaxi")
                .yearOfEstablishment(1992)
                .country("PL")
                .build();

        Manufacturer manufacturer2 = Manufacturer
                .builder()
                .name("Motomaxi")
                .yearOfEstablishment(1994)
                .country("PL")
                .build();

        Manufacturer manufacturer3 = Manufacturer
                .builder()
                .name("DBMoto")
                .yearOfEstablishment(1984)
                .country("DE")
                .build();

        Car car1 = Car.builder()
                .name("Seat")
                .price(32_000)
                .yearOfProduction(1998)
                .manufacturerList(List.of(manufacturer1))
                .engine(Engine.V6)
                .build();

        Car car2 = Car.builder()
                .name("VW")
                .price(62_000)
                .yearOfProduction(2017)
                .manufacturerList(List.of(manufacturer1,manufacturer2,manufacturer3))
                .engine(Engine.V12)
                .build();
        carService.addCar(car1);
        carService.addCar(car2);
        List<Car> expectedResult = List.of(car2);
        //when
        //then
        assertThat(carService.getListOfCarsWithAtLeast3Manufacturers()).isEqualTo(expectedResult);
        assertThat(carService.getListOfCarsWithAtLeast3Manufacturers().size()).isEqualTo(1);

    }

    @Test
    void ifCarOccurInCarService(){
        //given
        Manufacturer manufacturer1 = Manufacturer
                .builder()
                .name("Automaxi")
                .yearOfEstablishment(1992)
                .country("PL")
                .build();

        Manufacturer manufacturer2 = Manufacturer
                .builder()
                .name("Motomaxi")
                .yearOfEstablishment(1994)
                .country("PL")
                .build();

        Manufacturer manufacturer3 = Manufacturer
                .builder()
                .name("DBMoto")
                .yearOfEstablishment(1984)
                .country("DE")
                .build();

        Car car1 = Car.builder()
                .name("Seat")
                .price(32_000)
                .yearOfProduction(1998)
                .manufacturerList(List.of(manufacturer1))
                .engine(Engine.V6)
                .build();

        Car car2 = Car.builder()
                .name("VW")
                .price(62_000)
                .yearOfProduction(2017)
                .manufacturerList(List.of(manufacturer1,manufacturer2,manufacturer3))
                .engine(Engine.V12)
                .build();
        carService.addCar(car1);
        carService.addCar(car2);

        //when
        //then
        assertThat(carService.ifCarOccursInCarService(car1)).isTrue();
        assertThat(carService.ifCarOccursInCarService(car2)).isTrue();

    }

    @Test
    void shouldReturnTheListOfCarsWithPointedManufacturer(){
        //given
        Manufacturer manufacturer1 = Manufacturer
                .builder()
                .name("Automaxi")
                .yearOfEstablishment(1992)
                .country("PL")
                .build();

        Manufacturer manufacturer2 = Manufacturer
                .builder()
                .name("Motomaxi")
                .yearOfEstablishment(1994)
                .country("PL")
                .build();

        Manufacturer manufacturer3 = Manufacturer
                .builder()
                .name("DBMoto")
                .yearOfEstablishment(1984)
                .country("DE")
                .build();

        Car car1 = Car.builder()
                .name("Seat")
                .price(32_000)
                .yearOfProduction(1998)
                .manufacturerList(List.of(manufacturer1))
                .engine(Engine.V6)
                .build();

        Car car2 = Car.builder()
                .name("VW")
                .price(62_000)
                .yearOfProduction(2017)
                .manufacturerList(List.of(manufacturer1,manufacturer2,manufacturer3))
                .engine(Engine.V12)
                .build();
        carService.addCar(car1);
        carService.addCar(car2);
        //when
        //then
        assertThat(carService.getCarProducedByManufacturer(manufacturer1)).isEqualTo(List.of(car1,car2));
        assertThat(carService.getCarProducedByManufacturer(manufacturer2)).isEqualTo(List.of(car2));


    }

    @Test
    void shouldReturnTheListOfCarsSortedAscendingByPrice(){
        //given
        Manufacturer manufacturer1 = Manufacturer
                .builder()
                .name("Automaxi")
                .yearOfEstablishment(1992)
                .country("PL")
                .build();

        Manufacturer manufacturer2 = Manufacturer
                .builder()
                .name("Motomaxi")
                .yearOfEstablishment(1994)
                .country("PL")
                .build();

        Manufacturer manufacturer3 = Manufacturer
                .builder()
                .name("DBMoto")
                .yearOfEstablishment(1984)
                .country("DE")
                .build();

        Car car1 = Car.builder()
                .name("Seat")
                .price(32_000)
                .yearOfProduction(1998)
                .manufacturerList(List.of(manufacturer1))
                .engine(Engine.V6)
                .build();

        Car car2 = Car.builder()
                .name("VW")
                .price(62_000)
                .yearOfProduction(2017)
                .manufacturerList(List.of(manufacturer1,manufacturer2,manufacturer3))
                .engine(Engine.V12)
                .build();
        carService.addCar(car1);
        carService.addCar(car2);
        //when
        List<Car> sortedListOfCars = carService.getSortedListOfCars(FilterParameter.PRICE_ASCENDING);
        //then
        assertThat(sortedListOfCars).containsExactly(car1,car2);
    }

    @Test
    void shouldReturnTheListOfCarsSortedDescendingByPrice(){
        //given
        Manufacturer manufacturer1 = Manufacturer
                .builder()
                .name("Automaxi")
                .yearOfEstablishment(1992)
                .country("PL")
                .build();

        Manufacturer manufacturer2 = Manufacturer
                .builder()
                .name("Motomaxi")
                .yearOfEstablishment(1994)
                .country("PL")
                .build();

        Manufacturer manufacturer3 = Manufacturer
                .builder()
                .name("DBMoto")
                .yearOfEstablishment(1984)
                .country("DE")
                .build();

        Car car1 = Car.builder()
                .name("Seat")
                .price(32_000)
                .yearOfProduction(1998)
                .manufacturerList(List.of(manufacturer1))
                .engine(Engine.V6)
                .build();

        Car car2 = Car.builder()
                .name("VW")
                .price(62_000)
                .yearOfProduction(2017)
                .manufacturerList(List.of(manufacturer1,manufacturer2,manufacturer3))
                .engine(Engine.V12)
                .build();
        carService.addCar(car1);
        carService.addCar(car2);
        //when
        List<Car> sortedListOfCars = carService.getSortedListOfCars(FilterParameter.PRICE_DESCENDING);
        //then
        assertThat(sortedListOfCars).containsExactly(car2,car1);
    }

    @Test
    void shouldReturnTheListOfCarsSortedAscendingByYearOfProduction(){
        //given
        Manufacturer manufacturer1 = Manufacturer
                .builder()
                .name("Automaxi")
                .yearOfEstablishment(1992)
                .country("PL")
                .build();

        Manufacturer manufacturer2 = Manufacturer
                .builder()
                .name("Motomaxi")
                .yearOfEstablishment(1994)
                .country("PL")
                .build();

        Manufacturer manufacturer3 = Manufacturer
                .builder()
                .name("DBMoto")
                .yearOfEstablishment(1984)
                .country("DE")
                .build();

        Car car1 = Car.builder()
                .name("Seat")
                .price(32_000)
                .yearOfProduction(1998)
                .manufacturerList(List.of(manufacturer1))
                .engine(Engine.V6)
                .build();

        Car car2 = Car.builder()
                .name("VW")
                .price(62_000)
                .yearOfProduction(2017)
                .manufacturerList(List.of(manufacturer1,manufacturer2,manufacturer3))
                .engine(Engine.V12)
                .build();
        carService.addCar(car1);
        carService.addCar(car2);
        //when
        List<Car> sortedListOfCars = carService.getSortedListOfCars(FilterParameter.YEAR_OF_PRODUCTION_ASCENDING);
        //then
        assertThat(sortedListOfCars).containsExactly(car1,car2);
    }

    @Test
    void shouldReturnTheListOfCarsSortedDescendingByYearOfProduction(){
        //given
        Manufacturer manufacturer1 = Manufacturer
                .builder()
                .name("Automaxi")
                .yearOfEstablishment(1992)
                .country("PL")
                .build();

        Manufacturer manufacturer2 = Manufacturer
                .builder()
                .name("Motomaxi")
                .yearOfEstablishment(1994)
                .country("PL")
                .build();

        Manufacturer manufacturer3 = Manufacturer
                .builder()
                .name("DBMoto")
                .yearOfEstablishment(1984)
                .country("DE")
                .build();

        Car car1 = Car.builder()
                .name("Seat")
                .price(32_000)
                .yearOfProduction(1998)
                .manufacturerList(List.of(manufacturer1))
                .engine(Engine.V6)
                .build();

        Car car2 = Car.builder()
                .name("VW")
                .price(62_000)
                .yearOfProduction(2017)
                .manufacturerList(List.of(manufacturer1,manufacturer2,manufacturer3))
                .engine(Engine.V12)
                .build();
        carService.addCar(car1);
        carService.addCar(car2);
        //when
        List<Car> sortedListOfCars = carService.getSortedListOfCars(FilterParameter.YEAR_OF_PRODUCTION_DESCENDING);
        //then
        assertThat(sortedListOfCars).containsExactly(car2,car1);
    }

    @Test
    void shouldReturnFilteredListOfCarsAccordingToRelationOperator(){
        //given
        Manufacturer manufacturer1 = Manufacturer
                .builder()
                .name("Automaxi")
                .yearOfEstablishment(1992)
                .country("PL")
                .build();

        Manufacturer manufacturer2 = Manufacturer
                .builder()
                .name("Motomaxi")
                .yearOfEstablishment(1994)
                .country("PL")
                .build();

        Manufacturer manufacturer3 = Manufacturer
                .builder()
                .name("DBMoto")
                .yearOfEstablishment(1984)
                .country("DE")
                .build();

        Car car1 = Car.builder()
                .name("Seat")
                .price(32_000)
                .yearOfProduction(1998)
                .manufacturerList(List.of(manufacturer1))
                .engine(Engine.V6)
                .build();

        Car car2 = Car.builder()
                .name("VW")
                .price(62_000)
                .yearOfProduction(2017)
                .manufacturerList(List.of(manufacturer1,manufacturer2,manufacturer3))
                .engine(Engine.V12)
                .build();
        carService.addCar(car1);
        carService.addCar(car2);
        //when
        List<Car> filteredListOfCars = carService.getFilteredCarProducedInRelationToYear("<",2010);
        //then
        assertThat(filteredListOfCars).containsExactly(car1);
    }

    @Test
    void shouldNotReturnFilteredListOfCarsAccordingToRelationOperator(){
        //given
        Manufacturer manufacturer1 = Manufacturer
                .builder()
                .name("Automaxi")
                .yearOfEstablishment(1992)
                .country("PL")
                .build();

        Manufacturer manufacturer2 = Manufacturer
                .builder()
                .name("Motomaxi")
                .yearOfEstablishment(1994)
                .country("PL")
                .build();

        Manufacturer manufacturer3 = Manufacturer
                .builder()
                .name("DBMoto")
                .yearOfEstablishment(1984)
                .country("DE")
                .build();

        Car car1 = Car.builder()
                .name("Seat")
                .price(32_000)
                .yearOfProduction(1998)
                .manufacturerList(List.of(manufacturer1))
                .engine(Engine.V6)
                .build();

        Car car2 = Car.builder()
                .name("VW")
                .price(62_000)
                .yearOfProduction(2017)
                .manufacturerList(List.of(manufacturer1,manufacturer2,manufacturer3))
                .engine(Engine.V12)
                .build();
        carService.addCar(car1);
        carService.addCar(car2);
        //when
        //then
        assertThatThrownBy(()->carService.getFilteredCarProducedInRelationToYear(">>",2010)   )
                .isInstanceOf(RuntimeException.class);
    }
}