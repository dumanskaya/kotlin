// TARGET_BACKEND: JVM_IR
// FULL_JDK
// WITH_REFLECT
import kotlin.jvm.internal.*

class A
fun box(): String {
    val pckg = Reflection.getOrCreateKotlinPackage(A::class.java)
    System.gc()
    val pckg2 = Reflection.getOrCreateKotlinPackage(A::class.java)
    if (pckg === pckg2) return "OK"
    return "Fail"
}
