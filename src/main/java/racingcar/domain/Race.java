package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.List;

public class Race {

    public void startRace(List<Car> cars) {

        // 여기에 cars를 돌리면서 shouldCarMove()가 true일때 forward를 증가시키면 됨.
        for (Car car: cars) {
            if (shouldCarMove()) {
                car.forward++;
            }
        }

    }

    public boolean shouldCarMove() {
        int number = Randoms.pickNumberInRange(0, 9);
        System.out.println("number = " + number);
        return number >= 4;
    }
}
