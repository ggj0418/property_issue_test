# Property Issue Test

## How to run

```bash
# in linux terminal
$ gradlew clean build -x test
$ EXAMPLE_SERVICE_URL=http://127.0.0.1:8081
$ java -jar build/libs/property-issue-test-0.0.1-SNAPSHOT.jar
```

```terminal
# in windows cmd
> gradlew clean build -x test
> set EXAMPLE_SERVICE_URL=http://127.0.0.1:8081
> java -jar build/libs/property-issue-test-0.0.1-SNAPSHOT.jar
```