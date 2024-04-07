import { IFilm } from "./i-film"

export interface IUser {
  id:number,
  name:string,
  email:string,
  preferiti:IFilm[]
  password?:string
}
