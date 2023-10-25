package lesson_17

class Quiz() {
    var question = "Вопрос"
        get() = field
        set(value) {
            field = value
        }
    var answer = "Ответ"
        set(value) {
            field = value
        }
}