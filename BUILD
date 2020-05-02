load("@rules_java//java:defs.bzl", "java_binary", "java_library", "java_test")

java_binary(
    name = "watten",
    srcs = ["src/main/java/st/watten/Watten.java"],
    main_class = "st.watten.Watten",
)

java_library(
    name = "swatten",
    srcs = glob(["src/main/java/st/watten/*.java"]),
)

java_test(
    name = "AllTests",
    srcs = glob(["src/test/java/**/*.java"]),
    test_class = "AllTests",
    deps = [":swatten"],
)
