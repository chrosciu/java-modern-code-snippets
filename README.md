### Compile project

```shell
javac -d bin --enable-preview --release 17 -cp "lib/*" $(find src/main/java -name "*.java") 
```

### Compile project with preview warnings

```shell
javac -d bin --enable-preview --release 17 -cp "lib/*" -Xlint:preview $(find src/main/java -name "*.java")
```

### Clean project

```shell
rm -rf bin
```

### Run code not containing preview features

```shell
java -cp "bin:lib/*" com.chrosciu.switchextensions.Part01ArrowLabels 
```

### Run code containing preview features

```shell
java -cp "bin:lib/*" --enable-preview com.chrosciu.switchextensions.Part04PatternMatching
```