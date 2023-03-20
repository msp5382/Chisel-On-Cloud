cd Single-Cycle-CPU/RV32i
sbt
test:runMain datapath.Launcher Top --backend-name verilator
exit
mv test_run_dir/examples/Top ../../dist