sources=`find src -name "*.java"`
set -o xtrace
javac -classpath .:/run_dir/junit-4.12.jar:target/dependency/* -d bin $sources || exit
java -classpath .:/run_dir/junit-4.12.jar:target/dependency/* -cp bin main.Main
