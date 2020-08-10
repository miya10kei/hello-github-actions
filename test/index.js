const assert = require("assert")
const fizzbuzz = require("../index")

describe("fizzbuzz", () => {
  it("return FizzBuzz when value is divisible by 15", () => {
    assert(fizzbuzz(30) === "FizzBuzz")
  })

  it("return FizzBuzz when value is divisible by 3", () => {
    assert(fizzbuzz(9) === "Fizz")
  })

  it("return FizzBuzz when value is divisible by 5", () => {
    assert(fizzbuzz(10) === "Buzz")
  })

  it("return FizzBuzz when value is divisible by 5", () => {
    assert(fizzbuzz(7) === "7")
  })
})
