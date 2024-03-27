export interface iOggetto {
  id: number
  title: string
  description: string
  price: number
  discountPercentage: number
  rating: number
  stock: number
  brand: string
  category: string
  thumbnail: string
  images: string[]
}
export interface iJson {
  products: any[]
  total: number
  skip: number
  limit: number
}
