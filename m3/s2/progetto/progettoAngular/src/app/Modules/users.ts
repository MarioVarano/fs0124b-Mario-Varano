import { iToDo } from "./to-do"

export interface iUsers {
  id: number
  firstName: string
  lastName: string
  email: string
  image: string
  title: string
  todos?: iToDo[]
}
