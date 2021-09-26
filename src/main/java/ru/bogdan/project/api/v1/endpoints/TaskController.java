package ru.bogdan.project.api.v1.endpoints;

import org.springframework.http.MediaType;
import org.springframework.http.MediaTypeEditor;
import org.springframework.web.bind.annotation.*;
import ru.bogdan.project.api.v1.models.VariableDto;
import ru.bogdan.project.api.v1.utils.RandomUtils;

@RestController
@RequestMapping("/api/v1/route")
public class TaskController {

    @GetMapping(path = "/first", produces = "application/json")
    public VariableDto firstMethod() {
        int randomInRange = RandomUtils.getRandomInRange(500, 1500);

        try {
            Thread.sleep(randomInRange);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return new VariableDto(randomInRange);
    }

    @PostMapping(path = "/second", consumes = "application/json")
    public VariableDto secondMethod(@RequestBody VariableDto requestDto) {
        int randomInRange = RandomUtils.getRandomInRange(500, 1500);

        try {
            Thread.sleep(randomInRange);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return new VariableDto(requestDto.getVariable() + randomInRange);
    }

    @PostMapping(path = "/third", consumes = "application/json")
    public VariableDto thirdMethod(@RequestBody VariableDto requestDto) {
        int randomInRange = RandomUtils.getRandomInRange(500, 1500);

        try {
            Thread.sleep(randomInRange);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return new VariableDto(requestDto.getVariable() + randomInRange);
    }
}
