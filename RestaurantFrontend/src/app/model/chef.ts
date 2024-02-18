export interface chef{
    id?: number;
    name?: string;
    sex?: number;
    dateofbirth?: Date;
    workingyears?: number;
    datestartworking?: Date;
    salary?: number;
    status?: string;
    description?: string;
    
}

export class chefClass{
    constructor(
    public id?: number,
    public name?: string,
    public sex?: number,
    public dateofbirth?: Date,
    public workingyears?: number,
    public datestartworking?: Date,
    public salary?: number,
    public status?: string,
    public description?: string,
    ){}

}