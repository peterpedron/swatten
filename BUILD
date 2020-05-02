load("@rules_java//java:defs.bzl", "java_library", "java_test")

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
