fun foo() {}

fun test(s: String) = s

fun bar() = test(::foo.name)

// 0 getName
// 1 LDC "foo"